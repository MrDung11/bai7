package repository;

import model.Customer;
import model.Province;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface ICustomerRepository extends JpaRepository<Customer, Long> {
//    Iterable<Customer> findAllByProvince(Province province);

    Page<Customer> findAllByFirstNameContaining(String firstname, Pageable pageable);
//    Page<Customer> findAllByFirstName(String firstName, Pageable pageable);

//    @Query("SELECT c FROM Customer AS c WHERE c.firstName LIKE concat('%',: search,'%')")
//    Page<Customer> findAllByFirstNameContaining(@Param("search") String search, Pageable pageable);
}
