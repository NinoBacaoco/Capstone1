package capstone.model.service;

import org.springframework.stereotype.Service;

import capstone.model.dto.TbiBoardInOutDto;
import jakarta.mail.MessagingException;

@Service
public interface TbiBoardService {

    /**
     * TO get all applicants for TbiBOard
     * 
     * @return ManagerInOutDto
     */
    public TbiBoardInOutDto getAllApplicants();

    /**
     * To evaluate applicant
     * 
     * @return
     */
    public void evaluateApplicant(TbiBoardInOutDto inDto) throws MessagingException;

    /**
     * To get the details of the application by id pk
     * 
     * @param inDto
     * @return ApplicantInOutDto
     */
    public TbiBoardInOutDto getApplicantDetails(TbiBoardInOutDto inDto);
}