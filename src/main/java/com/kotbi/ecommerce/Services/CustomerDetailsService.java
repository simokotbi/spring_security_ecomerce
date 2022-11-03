package com.kotbi.ecommerce.Services;

import com.kotbi.ecommerce.Entities.Customer;
import com.kotbi.ecommerce.Repositories.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class CustomerDetailsService implements UserDetailsService {

    @Autowired
    private CustomerRepository customerRepository;
    @Override
    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
        Customer customer= customerRepository.findByEmail(email);
        if(customer==null){
            throw new UsernameNotFoundException("user not found!");
        }
        UserDetails user= User.withUsername(customer.getEmail()).password(customer.getPassword()).roles(customer.getRoles()).build();
        return user;
    }
}
