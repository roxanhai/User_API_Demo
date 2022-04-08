package com.example.finalspring.service;

import com.example.finalspring.model.dto.UserDTO;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public interface UserService {
    public ArrayList<UserDTO> getListUser();
    public UserDTO getUserById(int Id);
    public ArrayList<UserDTO> getListUserByName(String name);
}