package ma.cigma.pfe.module1.services.impl;

import ma.cigma.pfe.module1.dto.FactureEntity;
import ma.cigma.pfe.module1.repositories.FactureRepository;
import ma.cigma.pfe.module1.services.FactureServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Sofia BOUAGRA
 * @project PFE_SpringBoot
 */
@Service
public class FactureServiceImpl implements FactureServices {

    @Autowired
    private FactureRepository factureRepository;

    @Override
    public FactureEntity insertFacture(FactureEntity factureEntity) {
        return factureRepository.save(factureEntity);
    }

    @Override
    public FactureEntity updateFacture(FactureEntity factureEntity) {
        FactureEntity oldFactureEntity=factureRepository.findById(factureEntity.getId()).get();
        oldFactureEntity.setMontant(factureEntity.getMontant());
        oldFactureEntity.setDescription(factureEntity.getDescription());
        return factureRepository.save(oldFactureEntity);
    }

    @Override
    public void deleteFacture(Integer id) {
        factureRepository.deleteById(id);
    }

    @Override
    public FactureEntity selectOneFacture(Integer id) {
        return factureRepository.findById(id).get();
    }

    @Override
    public List<FactureEntity> selectAllFactures() {
        return (List<FactureEntity>) factureRepository.findAll();
    }
}
