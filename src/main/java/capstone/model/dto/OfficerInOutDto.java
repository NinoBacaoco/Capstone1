package capstone.model.dto;

import java.util.List;

import capstone.model.object.ApplicantDetailsObj;
import capstone.model.object.ApplicantObj;
import capstone.model.object.OfficerDashboardObj;
import lombok.Data;

@Data
public class OfficerInOutDto {
	
	private OfficerDashboardObj officerDashboardObj;
	
	private List<ApplicantObj> listOfApplicants;
	
	private int applicantIdPk;
	
	private String feedback;
	
	private Boolean resubmitFlg;
	
	ApplicantDetailsObj applicantDetailsObj;
	
	/*
	 * For Prescreen DTO
	 */
	private Boolean ctOneFlg;
	
	private String ctOneComments;
	
	private Boolean ctTwoFlg;
	
	private String ctTwoComments;

	private Boolean ctThreeFlg;
	
	private String ctThreeComments;

	private Boolean ctFourFlg;
	
	private String ctFourComments;

	private Boolean ctFiveFlg;

	private String ctFiveComments;

	private Boolean ctSixFlg;

	private String ctSixComments;

	private Boolean ctSevenFlg;

	private String ctSevenComments;

	private Boolean ctEightFlg;

	private String ctEightComments;

	private Boolean ctNineFlg;

	private String ctNineComments;

	private String recommendation;
}
