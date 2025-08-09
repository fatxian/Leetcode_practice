/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class first_bad_version_278 {
    public int firstBadVersion(int n) {
        int l = 1, h = n;
        int m;
        while(l<=h){
            m = l+(h-l)/2;
            if(!isBadVersion(m)){
                l=m+1;
            }else{
                h=m-1;
            }
        }
        return l;
    }
}
