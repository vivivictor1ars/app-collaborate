package backend.project.serviceimpl;

import backend.project.entities.Authority;
import backend.project.repositories.IRoleRepository;
import backend.project.services.IRoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class RoleServiceImplement implements IRoleService {
    @Autowired
    private IRoleRepository rR;

    @Override
    public void insert(Authority authority) {
        rR.save(authority);
    }

    @Override
    public List<Authority> list() {
        // TODO Auto-generated method stub
        return rR.findAll();
    }


    @Override
    public Authority ListId(long id) {
        return rR.findById(id).orElse(new Authority());
    }
}
