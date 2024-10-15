//package com.example.firstproject.repository;
//
//import com.example.firstproject.entity.Policy;
//import org.springframework.data.jpa.repository.JpaRepository;
//
//public interface PolicyRepository extends JpaRepository<Policy,Long> {
//
//}
package com.example.firstproject.repository;

        import com.example.firstproject.entity.Policy;
        import org.springframework.data.jpa.repository.JpaRepository;
        import org.springframework.stereotype.Repository;

@Repository
public interface PolicyRepository extends JpaRepository<Policy, Long> {
}
