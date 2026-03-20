# Leetcode153 Find minimum in rotated sorted array
## Ý tưởng
- Giả sử mảng không bị xoay thì chuyển thành bài toán tìm kiếm thông thường
- Sử dụng thuật toán tìm kiếm nhị phân để có độ phức tạp ổn định
## Cách thức
- Chia left mid right để chia mảng thành từng khoảng nhỏ chứa kết quả
- Kết quả luôn thuộc 1 hướng của mảng trong 2 trường hợp .mid > .right hoặc .mid < .right  
.mid > .right thì ta luôn nhận ra rằng kq sẽ nằm trong khoảng mid - right và cụ thể thì mid+1 - right  
.mid < .right thì dể thấy rằng nó sẽ nằm trong khoảng từ left-mid  
quy lần về thì đến lúc mid=right=left có nghĩa là giá trị nhỏ nhất được tìm thấy ở vị trí này  
return nums[mid]
