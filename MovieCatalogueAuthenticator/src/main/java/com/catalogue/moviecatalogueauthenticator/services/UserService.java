/**
 * 
 */
package com.catalogue.moviecatalogueauthenticator.services;

import com.catalogue.moviecatalogueauthenticator.dto.UserDTO;

import java.util.List;

/**
 * @author rohithvazhathody
 *
 */
public interface UserService {
    public List<UserDTO> getAllUsers();

    public UserDTO getUserById(Long userId);

    public UserDTO getUserByEmail(String userEmail);

    public UserDTO findByUserName(String userName);
}
