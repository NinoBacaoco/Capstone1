package capstone.model.service;

import org.springframework.stereotype.Service;

import capstone.model.dto.OfficerInOutDto;
import jakarta.mail.MessagingException;

@Service
public interface OfficerService {

    /**
     * To get all applicants for officer
     * 
     * @return OfficerInOutDto
     */
    public OfficerInOutDto getAllApplicants();

    /**
     * To accept an applicantion
     * 
     * @param inDto
     * @return OfficerInOutDto
     */
    public OfficerInOutDto acceptApplicant(OfficerInOutDto inDto) throws MessagingException;

    /**
     * To reject an applicants
     * 
     * @param inDto
     * @return OfficerInOutDto
     */
    public OfficerInOutDto rejectApplicant(OfficerInOutDto inDto) throws MessagingException;

    /**
     * To get the details of the application by id pk
     * 
     * @param inDto
     * @return OfficerInOutDto
     */
    public OfficerInOutDto getApplicantDetails(OfficerInOutDto inDto);
}