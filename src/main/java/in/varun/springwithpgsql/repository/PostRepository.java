package in.varun.springwithpgsql.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import in.varun.springwithpgsql.model.User;

@Repository
public interface PostRepository extends JpaRepository<User, Integer> {

}
