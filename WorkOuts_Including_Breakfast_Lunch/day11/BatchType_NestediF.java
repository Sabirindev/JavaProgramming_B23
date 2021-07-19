package day11;

public class BatchType_NestediF {
    public static void main(String[] args) {

        String batchType = "US morning",
                result="";
        boolean isValid = batchType == "US morning" || // confirmation of Valid or not valid batch
                batchType =="US evening" || batchType =="EU";

        if (isValid){
            if (batchType == "US morning"){
                result = "Class times are 10-5 EST. M, T, Th, F";
            }else if (batchType == "US evening"){
                result = "Class times are 7-10 EST. M, T, W, Th, S, S";
            }else {
                result = "Class times are  10-5 EST. M, T, W, Th, F";
            }
        }else {
            result ="Invalid Batch";
        }
        System.out.println(result);

    }
}
/*
In Cybertek we have three batch types: US morning, US evening, EU.
        Depending on a batch type (String) print information about the batch.

        First figure out is is a US batch or EU batch

            - for US batches:

                > Figure out is it a morning batch or evening batch
                    > morning - print: Class times are 10-5 EST. M, T, Th, F.
                    > evening - print: Class times are 7-10 EST. M, T, W, Th, S, S

            - for EU batches:

                > print: Class times are  10-5 EST. M, T, W, Th, F.

              If Batch type is not EU or US, print Invalid Batch
                NOTE: MUST APPLY NESTED IF
 */
