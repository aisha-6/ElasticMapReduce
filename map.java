module wordCount {
	public class Map extends Mapper<longwritable, text,="" intwritable=""> {
}
 private final static IntWritable one = new IntWritable(1);
 private Text word = new Text();
 @Override
 public void map(LongWritable key, Text value, Context context)
   throws IOException, InterruptedException {
   String line = value.toString();
   StringTokenizer tokenizer = new StringTokenizer(line);
   while (tokenizer.hasMoreTokens()) {
     word.set(tokenizer.nextToken());
     context.write(word, one);
   }
 }
}