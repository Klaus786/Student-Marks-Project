package za.ac.cput.Service;

import za.ac.cput.Entity.User;

import java.util.Set;

public interface IUserService extends IService<User, String>{
    Set<User> getAll();
}
