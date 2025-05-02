package az.developia.ClothesShop.repository;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import az.developia.ClothesShop.entity.ClotheEntity;
public interface ClotheRepository extends JpaRepository<ClotheEntity, Long> {
    List<ClotheEntity> findByOwnerId(Long ownerId);
    List<ClotheEntity> findAllByOrderByPriceAsc();
    List<ClotheEntity> findAllByOrderByPriceDesc();
    List<ClotheEntity> findByBrandContainingIgnoreCase(String brand);
}