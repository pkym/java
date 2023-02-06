package mvc;

public class MusicDTO {

   private String title, path;

   public MusicDTO(String title, String path) {
      
      this.title = title;
      this.path = path;
   }

   public String getTitle() {
      return title;
   }

   public String getPath() {
      return path;
   }
   
   
   
}