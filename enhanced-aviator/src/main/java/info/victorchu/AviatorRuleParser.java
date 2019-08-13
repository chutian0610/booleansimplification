package info.victorchu;

import info.victorchu.antlr4.AviatorLexer;
import info.victorchu.antlr4.AviatorParser;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import java.io.*;

public class AviatorRuleParser {

    public void parseAviatorRule(String exp,String ruleName){
        // 1. parse rule
        parseExp(exp);

    }

    public void parseExp(String exp){
        // parse aviator rule
//        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
//        System.out.println(exp);
//        System.out.println("===============================================================");
        AviatorLexer lexer = new AviatorLexer(CharStreams.fromString(exp));
        CommonTokenStream commonTokenStream = new CommonTokenStream(lexer);
        AviatorParser parser = new AviatorParser(commonTokenStream);
        ParseTree parseTree = parser.statement();

//        System.out.println(parseTree.toStringTree(parser));

        BooleanExpVisitor booleanExpVisitor = new BooleanExpVisitor();
        parseTree.accept(booleanExpVisitor);
    }

    public static void main(String[] args) throws IOException {
        AviatorRuleParser aviatorRuleParser = new AviatorRuleParser();
        String path =args[0];
        BufferedReader bufferedReader = new BufferedReader(new FileReader(path));
        String line;
        while ((line = bufferedReader.readLine())!=null){
            aviatorRuleParser.parseAviatorRule(line,"test");
        }

    }

}
