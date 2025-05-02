package az.developia.ClothesShop.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import az.developia.ClothesShop.Service.ClotheService;
import az.developia.ClothesShop.entity.ClotheEntity;

@RestController
@RequestMapping("/clothes")
public class ClotheController {
    @Autowired
    private ClotheService clotheService;
    @GetMapping
    public List<ClotheEntity> getAllClothes() {
        return clotheService.getAllClothes();
    }
    @GetMapping("/{id}")
    public Optional<ClotheEntity> getClothe(@PathVariable Long id) {
        return clotheService.getClotheById(id);
    }
    @GetMapping("/search")
    public List<ClotheEntity> searchClothes(@RequestParam String keyword) {
        return clotheService.searchClothes(keyword);
    }
    @PostMapping("/add")
    public void addClothe(@RequestBody ClotheEntity clotheEntity) {
        clotheService.addClothe(clotheEntity);
    }
    @DeleteMapping("delete/{id}")
    public void deleteClothe(@PathVariable Long id) {
        clotheService.deleteClothe(id);
    }
}