package com.company.UserCrud;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
    @Transactional
    public class UserService {
    @Autowired
    private UserRepostitory repo;

    public List<User> findAll(){
        return repo.findAll();
    }
   public  User get(long id){
    return repo.findById(id).get();
    }
    public void delete(long id) {
        repo.deleteById(id);
    }
}
