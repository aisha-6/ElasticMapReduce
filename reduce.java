
public class reduce {
	
public class Reduce extends Reducer<text, intwritable,="" text,="" intwritable=""> {
  @Override
  protected void reduce(Text key, java.lang.Iterable<intwritable> values,
    org.apache.hadoop.mapreduce.Reducer<text, intwritable,="" text,="" intwritable="">.Context context)
       throws IOException, InterruptedException {
     int sum = 0;
     for (IntWritable value : values) {
       sum += value.get();
     }
     context.write(key, new IntWritable(sum));
  }
}

}
