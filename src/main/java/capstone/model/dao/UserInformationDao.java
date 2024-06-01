package capstone.model.dao;

import org.springframework.dao.DataAccessException;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import capstone.model.dao.entity.UserInformationEntity;

public interface UserInformationDao extends JpaRepository<UserInformationEntity, Integer> {

    public final String GET_USER_BY_USERNAME = "SELECT e"
            + " FROM UserInformationEntity e"
            + " WHERE e.email = :email"
            + " AND e.deleteFlg = false";

    public final String GET_USER_BY_ID_PK = "SELECT e"
            + " FROM UserInformationEntity e"
            + " WHERE e.idPk = :idPk"
            + " AND e.deleteFlg = false";

    public final String GET_USER_BY_EVALUATED_TOKEN = "SELECT u "
            + "FROM EvaluatedApplicantEntity e "
            + "JOIN ApplicantEntity a ON a.idPk = e.applicantIdPk "
            + "JOIN UserInformationEntity u ON u.idPk = a.createdBy "
            + "WHERE e.token = :token "
            + "AND e.deleteFlg = false";

    public final String GET_USER_BY_REJECTED_TOKEN = "SELECT u "
            + "FROM RejectedApplicantEntity e "
            + "JOIN ApplicantEntity a ON a.idPk = e.applicantIdPk "
            + "JOIN UserInformationEntity u ON u.idPk = a.createdBy "
            + "WHERE e.token = :token "
            + "AND e.deleteFlg = false";

    public final String GET_USER_BY_APPLICANT_ID_PK = "SELECT u "
            + "FROM ApplicantEntity a "
            + "JOIN UserInformationEntity u ON u.idPk = a.createdBy AND u.deleteFlg = false "
            + "WHERE a.idPk = :applicantIdPk "
            + "AND a.deleteFlg = false";

    @Query(value = GET_USER_BY_APPLICANT_ID_PK)
    public UserInformationEntity getUserByApplicantIdPk(int applicantIdPk) throws DataAccessException;

    @Query(value = GET_USER_BY_EVALUATED_TOKEN)
    public UserInformationEntity getUserByEvaluatedtoken(String token) throws DataAccessException;

    @Query(value = GET_USER_BY_REJECTED_TOKEN)
    public UserInformationEntity getUserByRejectedtoken(String token) throws DataAccessException;

    @Query(value = GET_USER_BY_USERNAME)
    public UserInformationEntity getUserByUsername(String email) throws DataAccessException;

    @Query(value = GET_USER_BY_ID_PK)
    public UserInformationEntity getUserByIdPk(int idPk) throws DataAccessException;
}