  public static void main (String[] args)
    {
        String s = "hello-world";
        String[] str = s.split("-");
        char c =str[1].charAt(0);

      StringBuilder sb = new StringBuilder(str[1]);
      sb.setCharAt(0, Character.toUpperCase(sb.charAt(0)));
        System.out.println(sb);

        List<String> list = Arrays.asList(str);

//        list.stream().forEach(l-> System.out.println(l));


    }
