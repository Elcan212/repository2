package az.developia.ClothesShop.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import az.developia.ClothesShop.entity.ClotheEntity;
import az.developia.ClothesShop.repository.ClotheRepository;
@Service
public class ClotheService {
	    @Autowired
	    private ClotheRepository clotheRepository;

	    public void addClothe(ClotheEntity clotheEntity) {
	        clotheRepository.save(clotheEntity);
	    }

	    public void deleteClothe(Long id) {
	        clotheRepository.deleteById(id);
	    }

	    public List<ClotheEntity> getAllClothes() {
	        return clotheRepository.findAll();
	    }

	    public Optional<ClotheEntity> getClotheById(Long id) {
	    	return clotheRepository.findById(id);
	    }
	    public Optional<ClotheEntity> searchClothes(String keyword) {
	    	return clotheRepository.findByBrandContainingIgnoreCase(keyword);
	    }
}