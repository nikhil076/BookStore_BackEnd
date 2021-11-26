package com.javainuse.springbootsecurity.config;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.javainuse.springbootsecurity.model.DAOUser;
import com.javainuse.springbootsecurity.model.UserDTO;
import com.javainuse.springbootsecurity.repository.UserRepository;

@Service
public class CustomUserDetailsService implements UserDetailsService {

	@Autowired
	private UserRepository userDao;

	@Autowired
	private PasswordEncoder bcryptEncoder;
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		List<SimpleGrantedAuthority> roles = null;
		DAOUser user = userDao.findByEmailid(username);
		if (user != null) {
			roles = Arrays.asList(new SimpleGrantedAuthority(user.getRole()));
			return new User(user.getEmailid(), user.getPassword(), roles);
		}
		throw new UsernameNotFoundException("User not found with the email " + username);
	}

	
	public DAOUser save(UserDTO user) {
		DAOUser newUser = new DAOUser();
		newUser.setEmailid(user.getEmailid());
		newUser.setPassword(bcryptEncoder.encode(user.getPassword()));
		newUser.setRole(user.getRole());
		newUser.setFirstName(user.getFirstName());
		newUser.setLastName(user.getLastName());
		newUser.setDob(user.getDob());
		newUser.setKyc(user.getKyc());
		newUser.setRegisterDate(user.getRegisterDate());
		newUser.setUpdatedDate(user.getUpdatedDate());
		newUser.setOtp(user.getOtp());
		newUser.setPurchaseDate(user.getPurchaseDate());
		newUser.setExpiryDate(user.getExpiryDate());
		return userDao.save(newUser);
	}

	public Optional<DAOUser> getUserById(long id) {
		return userDao.findById(id);
	}
	
	public void deleteUserData(long id) {
		userDao.deleteById(id);
	}
}
