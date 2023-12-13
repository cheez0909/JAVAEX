/**
 * 1. 작성자 : Dani
 * 2. 작성일 : 12월 13일
 * 3. 애너테이션 @Deprecated 예제 - 대체되었으니 사용을 권하지 않음
 */
package annotationEx;
public class AnnotationEx1 {

    public static void main(String[] args) {
        Book book = new Book();
        book.setOldName("오래된필드");
        System.out.println(book.getOldName());
    }

    static class Book{

        @Deprecated
        public String oldName;

        public String newName;

        @Deprecated
        public String getOldName() {
            return oldName;
        }

        @Deprecated
        public void setOldName(String oldName) {
            this.oldName = oldName;
        }


        public String getNewName() {
            return newName;
        }

        public void setNewName(String newName) {
            this.newName = newName;
        }
    }
}
