package com.example.servicelayer;

import com.example.servicelayer.DTO.AddressDto;
import com.example.servicelayer.DTO.CompanyDto;
import com.example.servicelayer.DTO.GeoDto;
import com.example.servicelayer.DTO.UsersDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@RequestMapping(method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
@Service("userService")
public class UserService {
    @Autowired
    private SLRepository  slRepository;

    public Users saveUsers(UsersDto usersDto) {
        Users users=populateUserEntity(usersDto);
        return slRepository.save(users);
    }
    public List<Users> getAllUsers(){

        return slRepository.findAll();
    }
    public Users getUsersByID(Long id){
        return slRepository.getReferenceById(id);

    }
    public Users saveUser(Users users) {
        users.getCompany().setCompany_Id(Long.valueOf(users.getId()));
        users.getAddress().setAdd_Id(Long.valueOf(users.getId()));
        users.getAddress().getGeo().setAddress_Id(Long.valueOf(users.getId()));
        return slRepository.save(users);
    }

    public void deleteUsers(Long id){

        slRepository.deleteById(id);
    }

    public Users updateUsers(Long id,  UsersDto usersDto){
        Users    users = populateUserEntity(usersDto);
        return slRepository.saveAndFlush(users);

    }

    private Users populateUserEntity(final UsersDto usersDto) {
        Users users=new Users();
         Address address =new Address();
        Geo geo=new Geo();
        Company company=new Company();
        company.setBs(usersDto.getCompany().getBs());
        company.setName(usersDto.getCompany().getName());
        company.setCatchPhrase(usersDto.getCompany().getCatchPhrase());
        geo.setLat(usersDto.getAddress().getGeo().getLat());
        geo.setLng(usersDto.getAddress().getGeo().getLng());
        address.setStreet(usersDto.getAddress().getStreet());
        address.setSuite(usersDto.getAddress().getSuite());
        address.setCity(usersDto.getAddress().getCity());
        address.setZipcode(usersDto.getAddress().getZipcode());
        address.setGeo(geo);
        users.setId(Long.valueOf(usersDto.getId()));
        users.setUsername(usersDto.getName());
        users.setName(usersDto.getName());
        users.setEmail(usersDto.getEmail());
        users.setAddress(address);
        users.setPhone(usersDto.getPhone());
        users.setWebsite(usersDto.getWebsite());
        users.setCompany(company);
        users.getCompany().setCompany_Id(Long.valueOf(usersDto.getId()));
        users.getAddress().setAdd_Id(Long.valueOf(usersDto.getId()));
        users.getAddress().getGeo().setAddress_Id(Long.valueOf(usersDto.getId()));
        return users;
    }
}
