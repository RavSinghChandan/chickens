package texal.dstudio.model;


import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.FieldType;
import org.springframework.data.mongodb.core.mapping.MongoId;
import texal.dstudio.enums.Gender;
import texal.dstudio.enums.Role;
import texal.dstudio.enums.Status;

import java.time.LocalDate;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@Document(collection = "user_master")
public class Customer {

	@Id
	@MongoId(FieldType.OBJECT_ID)
	private String  id;
	private String firstName;
	private String lasName;
	private String MiddleName;
	private String email;
	private String userName;
	private String password;
	private String notes;
	private Gender gender;
	private String mobileNumber;
	private LocalDate dateOfJoining;
	private LocalDate dateOfRegistration;
	private LocalDate passwordExpiryDate;
	private Status status;
	private LocalDate dateOfBirth;
	private LocalDate dateOfTermination;
	private  Role role ;
	private String createDt;
}