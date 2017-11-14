//package com.pepcus.messaging.user.repository;
//
//
//import com.pepcus.messaging.user.model.User;
//import org.springframework.stereotype.Repository;
//
//import javax.persistence.EntityManager;
//import javax.persistence.PersistenceContext;
//import java.util.List;
//
//@Repository
//public class UserManagementRespository implements IUserManagementRespository {
//
//    @PersistenceContext
//    private EntityManager entityManager;
//
//    @Override
//    public void delete(long id) {
//        entityManager.remove(findOne(id));
//    }
//
//    @Override
//    public List<User> findAll() {
//        String hql = "FROM Users order by Id\n";
//        return (List<User>) entityManager.createQuery(hql).getResultList();
//    }
//
//    @Override
//    public User findOne(long id) {
//        return entityManager.find(User.class,id);
//    }
//
//    @Override
//    public void save(User user) {
//         entityManager.persist(user);
//    }
//
//    @Override
//    public void update(User user) {
//        User existingUser=findOne(user.getId());
//        existingUser.setPassword(user.getPassword());
//        existingUser.setFirebaseAppId(user.getFirebaseAppId());
//        entityManager.flush();
//
//    }
//}
