package lk.boralesgamuwaMedical.asset.discountRatio.service;

import lk.boralesgamuwaMedical.asset.discountRatio.dao.DiscountRatioDao;
import lk.boralesgamuwaMedical.asset.discountRatio.entity.DiscountRatio;
import lk.boralesgamuwaMedical.asset.discountRatio.entity.Enum.DiscountRatioStatus;
import lk.boralesgamuwaMedical.util.interfaces.AbstractService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DiscountRatioService implements AbstractService< DiscountRatio, Integer > {
private final DiscountRatioDao discountRatioDao;

    public DiscountRatioService(DiscountRatioDao discountRatioDao) {
        this.discountRatioDao = discountRatioDao;
    }

    public List< DiscountRatio > findAll() {
        return discountRatioDao.findAll();
    }

    public DiscountRatio findById(Integer id) {
        return discountRatioDao.getOne(id);
    }

    public DiscountRatio persist(DiscountRatio discountRatio) {
        if ( discountRatio.getId() == null ){
            discountRatio.setDiscountRatioStatus(DiscountRatioStatus.ACTIVE);
        }
        return discountRatioDao.save(discountRatio);
    }

    public boolean delete(Integer id) {
        return false;
    }

    public List< DiscountRatio > search(DiscountRatio discountRatio) {
        return null;
    }
}
