class Solution {
    public int solution(int chicken) {
        int coupon = chicken;  
        int serviceChicken = 0; 
     
        while (coupon >= 10) {  
            int orderChicken = coupon / 10; 
            serviceChicken += orderChicken; 
            coupon = coupon % 10 + orderChicken;
        }
        return serviceChicken;
    }
}
