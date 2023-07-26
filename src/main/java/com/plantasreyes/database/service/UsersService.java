package com.plantasreyes.database.service;


import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.plantasreyes.database.entity.Users;
import com.plantasreyes.database.repository.UsersRepository;


@Service
public class UsersService {
	@Autowired
	private UsersRepository usersRepository;
	
	
	//Get
	public List<Users> getAllUsers(){
		return usersRepository.findAll();

	}
	
	//Get by Id
	public Users getUsersById(Long id) {
		return usersRepository.findById(id).orElse(null);
	}
	
	//Post
	public Users createUsers(Users users) {
		return usersRepository.save(users);
	}
	
	// Put
	public Users updateUsers(Users users) {
		return usersRepository.save(users);
	}
	
	//Delete (necesario por id)
	public void deleteUsers(Long id) {
		usersRepository.deleteById(id);
	}
}
