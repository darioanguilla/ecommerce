package com.arces.ecommerce.usercard;

import java.util.List;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional

public class UserCardService {

    @Autowired
    private UserCardRepository repo;

    public List<UserCard> listAll() {
        return repo.findAll();
    }

    public void save(UserCard userCard) {
        repo.save(userCard);

    }

    public void saveAll(List<UserCard> userCards) {
        repo.saveAll(userCards);

    }

    public UserCard get(Long id) {
        return repo.findById(id).get();
    }

    public void delete(Long id) {
        repo.deleteById(id);
    }
}