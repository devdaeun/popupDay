package flower.popupday.admin.service;

import flower.popupday.admin.dto.AdminDTO;
import org.springframework.dao.DataAccessException;

import java.util.List;
import java.util.Map;

public interface AdminService {
   // public List memberShip() throws DataAccessException;
    public Map memberShip(Map<String, Integer> pagingMap) throws DataAccessException;

    public AdminDTO findMember(Long id) throws  DataAccessException;

    public void updateMember(AdminDTO adminDTO) throws DataAccessException;

    public void delMember(Long id) throws DataAccessException;

}
