import javax.servlet.http.*;
import javax.servlet.*;
import java.io.*;
import com.mongodb.MongoClient;
import com.mongodb.MongoException;
import com.mongodb.WriteConcern;

import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.BasicDBObject;
import com.mongodb.DBObject;
import com.mongodb.DBCursor;

import com.mongodb.ServerAddress;
import java.util.Arrays;

public class DemoServ extends HttpServlet
{
public void doGet(HttpServletRequest req,HttpServletResponse res)throws ServletException,IOException
{
 try{
	 PrintWriter out=res.getWriter();
		String sens_id=req.getParameter("countryCode");
		//String region=res.getParameter(region);
		//String lat=res.getParameter(lat);
		//String log=res.getParameter(log);
		
         // To connect to mongodb server
         MongoClient mongoClient = new MongoClient( "localhost" , 27017 );
			
         // Now connect to your databases
         DB db = mongoClient.getDB( "student" );
		 //out.println(sens_id);
         //out.println("Connect to database successfully");
         	DBCollection usrreg= db.getCollection("name");
			BasicDBObject doc=new BasicDBObject();
				doc.put("name",sens_id);
			
			
			
				
				usrreg.insert(doc);
				out.println("inserted");
      }
	  catch(Exception e){
         //err.println( e.getClass().getName() + ": " + e.getMessage() );
      }
   }





}
