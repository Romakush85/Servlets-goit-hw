package ua.goit.jdbc.repository;

import ua.goit.jdbc.dao.DeveloperProjectRelationDao;

import java.sql.SQLException;
import java.util.List;
import java.util.Optional;

public class DeveloperProjectRelationRepository implements Repository<DeveloperProjectRelationDao>{
    private final static String INSERT = "INSERT INTO developers_projects (dev_id, project_id) " +
            "VALUES (?, ?)";

    @Override
    public DeveloperProjectRelationDao save(DeveloperProjectRelationDao entity) {
        return null;
    }

    @Override
    public void update(DeveloperProjectRelationDao entity) {

    }

    @Override
    public Optional<DeveloperProjectRelationDao> findById(Integer id) throws SQLException {
        return null;
    }

    @Override
    public List<DeveloperProjectRelationDao> findAll() {
        return null;
    }
}
