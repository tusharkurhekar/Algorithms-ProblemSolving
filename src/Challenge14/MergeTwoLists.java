/**
 * 
 */
package Challenge14;

/**
 * @author tusharkurhekar
 *
 */
public class MergeTwoLists {

	/**
	 * 
	 */
	public ListNode MergeTwoLists(ListNode list1, ListNode list2) {

        //recursion

        if(list1!=null &&list2!=null){
            if(list1.val<list2.val){
                list1.next=MergeTwoLists(list1.next,list2);
                return list1;
            }else{
                list2.next=MergeTwoLists(list1,list2.next);
                return list2;
            }

        }
        if(list1==null){
            return list2;
        } return list1;

        
	}

}
