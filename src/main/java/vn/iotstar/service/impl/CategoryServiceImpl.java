package vn.iotstar.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import vn.iotstar.repository.CategoryRepository;
import vn.iotstar.entity.Category;
import vn.iotstar.service.ICategoryService;

@Service
public class CategoryServiceImpl implements ICategoryService {

	@Autowired
	CategoryRepository categoryRepository;

	@Override
	public void delete(Category entity) {
		categoryRepository.delete(entity);
	}

	@Override
	public void deleteById(Long id) {
		categoryRepository.deleteById(id);
	}

	@Override
	public long count() {
		return categoryRepository.count(); 
	}

	@Override
	public <S extends Category> Optional<S> findOne(Example<S> example) {
		return categoryRepository.findOne(example);
	}

	@Override
	public Optional<Category> findById(Long id) {
		return categoryRepository.findById(id); 
	}

	@Override
	public List<Category> findAllById(Iterable<Long> ids) {
		return categoryRepository.findAllById(ids);
	}

	@Override
	public List<Category> findAll(Sort sort) {
		return categoryRepository.findAll(sort); 
	}

	@Override
	public Page<Category> findAll(Pageable pageable) {
		return categoryRepository.findAll(pageable);
	}

	@Override
	public List<Category> findAll() {
		return categoryRepository.findAll();
	}

	@Override
	public Optional<Category> findByCategoryName(String name) {
		return categoryRepository.findByCategoryName(name);
	}

	@Override
	public <S extends Category> S save(S entity) {
		return categoryRepository.save(entity);
	}

	@Override
	public Page<Category> findByCategoryNameContaining(String name, Pageable pageable) {
		return categoryRepository.findByCategoryNameContaining(name, pageable); 
	}

	@Override
	public List<Category> findByCategoryNameContaining(String name) {
		return categoryRepository.findByCategoryNameContaining(name);
	}

}
