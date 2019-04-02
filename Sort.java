package test;

public class BubbleSort {
		public static void main(String[] args) {
				int[] array= {11,22,15,17,20};
				int[] s=sortByXiEr(array);
				for(int k:s)
					System.out.print(k+" ");
				
		}
		
		/**
		 * 冒泡排序
		 * @param array
		 * @return
		 */
		private static int[] sortByBubbole(int[] array) {
			for(int i=0;i<array.length-1;i++) {
				for(int j=1;j<array.length-1-i;j++) {
					if(array[j]>array[j+1]) {
						int temp=array[j];
						array[j]=array[j+1];
						array[j+1]=temp;
					}
				}
			}
			return array;
		}
		
		/**
		 * 选择排序
		 * @param array
		 * @return
		 */
		private static int[] sortBySelection(int[] array) {
			//做第i趟排序
			for(int i=0;i<array.length-1;i++) {
				int k=i;
				//找最小的元素
				for(int j=k+1;j<array.length;j++) {
					if(array[j]<array[k]) {
						//记录下标位置
						k=j;
					}
				}
				//找到本轮循环的最小数，交换值
				if(i!=k) {
					int temp=array[i];
					array[i]=array[k];
					array[k]=temp;
				}
			}
			return array;
		}
		
		/**
		 * 插入排序
		 * @param array
		 * @return
		 */
		private static int[] sortByInsertion(int[] array) {
			for(int i=1;i<array.length;i++) {
				int j=i;
				while(j>0 && array[j]<array[j-1]) {
					int temp=array[j];
					array[j]=array[j-1];
					array[j-1]=temp;
					j--;
				}
			}
			return array;
			
		}
		private static int[] sortByXiEr(int[] array) {
			int h=1;
			while(h<array.length/3) {
				h=h*3+1;
			}
			while(h>=1) {
				for(int i=h;i<array.length;i++) {
					for(int j=i;j>=0 && array[j]<array[j-h];j-=h) {
						int temp=array[j];
						array[j]=array[j-1];
						array[j-1]=temp;
					}
				}
				h=h/3;
			}
			
			return array;
			
		}
	}
