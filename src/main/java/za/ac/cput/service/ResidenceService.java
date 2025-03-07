package za.ac.cput.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import za.ac.cput.model.Residence;
import za.ac.cput.repository.ResidenceRepository;

import java.util.List;

@Service
public class ResidenceService implements IService<Residence,Long> {

    private final ResidenceRepository residenceRepository;

    @Autowired
    public ResidenceService(ResidenceRepository residenceRepository) {
        this.residenceRepository = residenceRepository;
    }

    @Override
    public Residence create(Residence residence) {
        return residenceRepository.save(residence);
    }

    @Override
    public Residence read(Long Id) {
        return residenceRepository.findById(Id).orElse(null);
    }

    @Override
    public Residence update(Residence residence) {
        return residenceRepository.save(residence);
    }

    @Override
    public void delete(Long Id) {
        if(residenceRepository.existsById(Id))
     residenceRepository.deleteById(Id);
        else {
            throw new IllegalStateException("Residence not found");
        }
    }

    @Override
    public List<Residence> getAll() {
        return residenceRepository.findAll();
    }
}
