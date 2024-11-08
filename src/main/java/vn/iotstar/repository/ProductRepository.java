package vn.iotstar.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import vn.iotstar.entity.Product;
import java.util.List;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Repository;
import vn.iotstar.entity.Product;
public interface ProductRepository extends JpaRepository<Product, Long>{

	//Tìm Kiếm theo nội dung tên
    List<Product> findByProductNameContaining(String name);
    //Tìm kiếm và Phân trang
    Page<Product> findByProductNameContaining(String name,Pageable pageable);
}
