package cl.forum.siniestros;

/**
 * This class was automatically generated by the data modeler tool.
 */

@javax.xml.bind.annotation.XmlRootElement(name = "resultado")
public class Respuesta implements java.io.Serializable
{

   static final long serialVersionUID = 1L;

   @org.kie.api.definition.type.Label("success")
   private java.lang.Boolean success;

   @org.kie.api.definition.type.Label("Body")
   private java.util.List<cl.forum.siniestros.Siniestros> body;

   public Respuesta()
   {
   }

   public java.lang.Boolean getSuccess()
   {
      return this.success;
   }

   public void setSuccess(java.lang.Boolean success)
   {
      this.success = success;
   }

   public java.util.List<cl.forum.siniestros.Siniestros> getBody()
   {
      return this.body;
   }

   public void setBody(java.util.List<cl.forum.siniestros.Siniestros> body)
   {
      this.body = body;
   }

   public Respuesta(java.lang.Boolean success,
         java.util.List<cl.forum.siniestros.Siniestros> body)
   {
      this.success = success;
      this.body = body;
   }

}