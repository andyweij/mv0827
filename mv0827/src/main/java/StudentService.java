

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import model.Student;

@Path("/student")
public class StudentService {    

    @POST
    @Path("/post")
    @Consumes(MediaType.APPLICATION_JSON)
    public Response postStudentRecord(Student  cst){
        String result = "Record entered: "+ cst;
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("mv0827");
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        em.persist(cst);
        em.getTransaction().commit();
        em.close();
        emf.close();
        return Response.ok().entity(result).build();
    }

}
