package service.customer;

import model.Customer;
import model.Province;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import service.IGenerateService;

public interface ICustomerService extends IGenerateService<Customer> {
//    Iterable<Customer> findAllByProvince(Province province);

    Page<Customer> findAll(Pageable pageable);
    Page<Customer> findAllByFirstNameContaining(String firstname, Pageable pageable);

    /*
    - Trong đó Pageable là 1 đối tượng có chứa 3 thuộc tính page, size và sort hỗ trợ cho việc phân trang.
    Pageable được tự động ánh xạ từ request. Lưu ý vì lớp Pageable có ở 2 thư viện để import nên chúng ta sẽ import lớp Pageabe
    từ thư viện org.springframework.data.domain.Pageable.

    - Page<> là đối tượng chứa danh sách các thực thể và các thuộc tính của một trang. Page<> được trả về trong response.

    - Phương thức findAllByFirstNameContaining sẽ được Spring Data Repository tự động tạo proxy để thực hiện câu lệnh truy vấn.
    Thực hiện chức năng tìm kiếm Customer theo firstname
     */
}
