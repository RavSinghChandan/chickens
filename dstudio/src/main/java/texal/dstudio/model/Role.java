//package texal.dstudio.model;
//
//
//import com.fasterxml.jackson.annotation.JsonEnumDefaultValue;
//import lombok.*;
//import org.bson.types.ObjectId;
//import org.springframework.data.annotation.Id;
//import org.springframework.data.mongodb.core.mapping.DBRef;
//import org.springframework.data.mongodb.core.mapping.Document;
//import org.springframework.data.mongodb.core.mapping.FieldType;
//import org.springframework.data.mongodb.core.mapping.MongoId;
//import texal.dstudio.enums.ERole;
//
//@AllArgsConstructor
//@NoArgsConstructor
//@Getter
//@Setter
//@ToString
//@Document(collection = "roles")
//public class Role {
//    @Id
//    @MongoId(FieldType.OBJECT_ID)
//    private ObjectId id;
//
//    private ERole name;
//}
