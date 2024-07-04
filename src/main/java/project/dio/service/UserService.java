package project.dio.service;

import project.dio.domain.model.User;

public interface UserService {

    User findById(long id);

    User create(User userToCreate);
}
