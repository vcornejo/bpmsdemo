package cl.forum.siniestros;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class Body implements java.io.Serializable
{

   static final long serialVersionUID = 1L;

   @org.kie.api.definition.type.Label(value = "Siniestros")
   private java.util.List<java.lang.String> siniestros;

   public Body()
   {
   }

   public java.util.List<java.lang.String> getSiniestros()
   {
      return this.siniestros;
   }

   public void setSiniestros(java.util.List<java.lang.String> siniestros)
   {
      this.siniestros = siniestros;
   }

   public Body(java.util.List<java.lang.String> siniestros)
   {
      this.siniestros = siniestros;
   }

}