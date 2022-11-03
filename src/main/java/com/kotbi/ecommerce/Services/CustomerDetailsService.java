package com.kotbi.ecommerce.Services;

import com.kotbi.ecommerce.Entities.Customer;
import com.kotbi.ecommerce.Repositories.CustomerRepository;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class CustomerDetailsService implements UserDetailsService {

 private CustomerRepository customerRepository;
    @Override
    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
        Customer customer= customerRepository.findByEmail(email);
        if(customer==null){
            throw new UsernameNotFoundException("user not found!");
        }
        return customer;
    }
}
