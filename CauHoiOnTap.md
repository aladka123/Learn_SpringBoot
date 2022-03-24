***Câu 1***  
Trong quá trình tạo dự án Spring Boot chúng ta phải khai báo những tham số sau đây : groupID, artifactID. Ý nghĩa các tham số này là gì?  

 groupID là tên của công ty hoặc nhóm đã tạo ra dự án
 artifactID là tên của dự án

 ---

***Câu 2***  
Tại sao phải đảo ngược tên miền trong <groupId>vn.techmaster</groupId>?  

Vì đó là quy ước của java để tránh xung đột.

---

***Câu 3***  
SpringBoot có 2 cơ chế để quản lý thư viện. Hãy kể tên chúng? 

là Maven và Gladle

---

***Câu 4***  
File pom.xml có tác dụng gì?

File pom.xml là nơi khai báo tất cả những gì liên quan đến dự án được cấu hình qua maven, như khai báo các dependency, version của dự án, tên dự án, repossitory …

---

***Câu 5***  
Trong file pom.xml có các thẻ dependency. Ý nghĩa của chúng là gì?

Dùng để khai báo thư viện

---
***Câu 7***

Ý nghĩa của @RequestMapping là gì? Nó có những tham số gì ngoài value?  
Có nhiệm vụ ánh xạ các request (yêu cầu) người dùng vào method tương ứng trong controller.

Ngoài value thì @RequestMapping còn có các tham số khác như :

header
produces
method
params

---
***Câu 11***
@GetMapping khác gì so với @PostMapping ?


@PostMapping là phiên bản chuyên biệt của chú thích @RequestMapping hoạt động như một phím tắt cho @RequestMapping (method = RequestMethod.POST). Các phương thức chú thích @PostMapping trong các lớp được chú thích @Controller xử lý các yêu cầu HTTP POST khớp với biểu thức URI đã cho.

@GetMapping là phiên bản chuyên biệt của chú thích @RequestMapping hoạt động như một phím tắt cho @RequestMapping (method = RequestMethod.GET). Các phương thức chú thích @GetMapping trong các lớp được chú thích @Controller xử lý các yêu cầu HTTP GET khớp với biểu thức URI đã cho.




