package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;

import com.example.calculator.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;
    private int amal;
    private int equals;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(binding.getRoot());

        amal = 0;
        equals = 0;
//        binding.answer.setText("");
        binding.ac.setOnClickListener(view -> {
//            binding.answer.setText("");
            binding.typingText.setText("");
        });
        binding.plusMinus.setOnClickListener(view -> {
            String s = binding.typingText.getText().toString().trim();
            if (!s.equals("")) {
                if (!s.contains("/") && !s.contains("*") && !s.substring(1).contains("-") && !s.contains("+") && !s.endsWith(".")) {
                    double v = Double.parseDouble(s) * (-1);
                    binding.typingText.setText(String.valueOf(Double.parseDouble(s) * (-1)));
                }
            }
        });
        binding.percent.setOnClickListener(view -> {
            String a = binding.typingText.getText().toString().trim();
            if (!a.equals("")) {
                boolean numeric = isNumeric(a);
                if (numeric && !a.endsWith(".")) {
                    amal = 1;
                    equals = 1;
                    double v = Double.parseDouble(a);
                    binding.typingText.setText(String.valueOf(v / 100));
                }
            }
        });
        binding.division.setOnClickListener(view -> {
            String trim = binding.typingText.getText().toString().trim();
            if (!trim.equals("")) {
                if (!trim.contains("/")) {
                    if (isNumeric(trim) && !trim.endsWith(".")) {
                        amal = 2;
                        binding.typingText.setText(trim + "/");
                    }
                }
            }
        });
        binding.seven.setOnClickListener(view -> {
            if (equals == 1) {
                String s = binding.typingText.getText().toString().trim();
                if (s.contains("/") || s.contains("*") || s.contains("-") || s.contains("+")) {
                    String a = binding.typingText.getText().toString().trim();
                    binding.typingText.setText(a + "7");
                } else {
                    binding.typingText.setText("");
                    binding.typingText.setText("7");
                    equals = 0;
                }
            } else {
                String a = binding.typingText.getText().toString().trim();
                binding.typingText.setText(a + "7");
            }
        });
        binding.eight.setOnClickListener(view -> {
            if (equals == 1) {
                String s = binding.typingText.getText().toString().trim();
                if (s.contains("/") || s.contains("*") || s.contains("-") || s.contains("+")) {
                    String a = binding.typingText.getText().toString().trim();
                    binding.typingText.setText(a + "8");
                } else {
                    binding.typingText.setText("");
                    binding.typingText.setText("8");
                    equals = 0;
                }
            } else {
                String a = binding.typingText.getText().toString().trim();
                binding.typingText.setText(a + "8");
            }
        });
        binding.nine.setOnClickListener(view -> {
            if (equals == 1) {
                String s = binding.typingText.getText().toString().trim();
                if (s.contains("/") || s.contains("*") || s.contains("-") || s.contains("+")) {
                    String a = binding.typingText.getText().toString().trim();
                    binding.typingText.setText(a + "9");
                } else {
                    binding.typingText.setText("");
                    binding.typingText.setText("9");
                    equals = 0;
                }
            } else {
                String a = binding.typingText.getText().toString().trim();
                binding.typingText.setText(a + "9");
            }
        });
        binding.multiply.setOnClickListener(view -> {
            String trim = binding.typingText.getText().toString().trim();
            if (!trim.equals("")) {
                if (!trim.contains("*")) {
                    if (isNumeric(trim) && !trim.endsWith(".")) {
                        amal = 3;
                        binding.typingText.setText(trim + "*");
                    }
                }
            }
        });
        binding.four.setOnClickListener(view -> {
            if (equals == 1) {
                String s = binding.typingText.getText().toString().trim();
                if (s.contains("/") || s.contains("*") || s.contains("-") || s.contains("+")) {
                    String a = binding.typingText.getText().toString().trim();
                    binding.typingText.setText(a + "4");
                } else {
                    binding.typingText.setText("");
                    binding.typingText.setText("4");
                    equals = 0;
                }
            } else {
                String a = binding.typingText.getText().toString().trim();
                binding.typingText.setText(a + "4");
            }
        });
        binding.five.setOnClickListener(view -> {
            if (equals == 1) {
                String s = binding.typingText.getText().toString().trim();
                if (s.contains("/") || s.contains("*") || s.contains("-") || s.contains("+")) {
                    String a = binding.typingText.getText().toString().trim();
                    binding.typingText.setText(a + "5");
                } else {
                    binding.typingText.setText("");
                    binding.typingText.setText("5");
                    equals = 0;
                }
            } else {
                String a = binding.typingText.getText().toString().trim();
                binding.typingText.setText(a + "5");
            }
        });
        binding.six.setOnClickListener(view -> {
            if (equals == 1) {
                String s = binding.typingText.getText().toString().trim();
                if (s.contains("/") || s.contains("*") || s.contains("-") || s.contains("+")) {
                    String a = binding.typingText.getText().toString().trim();
                    binding.typingText.setText(a + "6");
                } else {
                    binding.typingText.setText("");
                    binding.typingText.setText("6");
                    equals = 0;
                }
            } else {
                String a = binding.typingText.getText().toString().trim();
                binding.typingText.setText(a + "6");
            }
        });
        binding.minus.setOnClickListener(view -> {
            String trim = binding.typingText.getText().toString().trim();
            if (!trim.equals("")) {
                if (!trim.endsWith("-")) {
                    if (isNumeric(trim) && !trim.endsWith(".")) {
                        amal = 4;
                        binding.typingText.setText(trim + "-");
                    }
                }
            }
        });
        binding.one.setOnClickListener(view -> {
            if (equals == 1) {
                String s = binding.typingText.getText().toString().trim();
                if (s.contains("/") || s.contains("*") || s.contains("-") || s.contains("+")) {
                    String a = binding.typingText.getText().toString().trim();
                    binding.typingText.setText(a + "1");
                } else {
                    binding.typingText.setText("");
                    binding.typingText.setText("1");
                    equals = 0;
                }
            } else {
                String a = binding.typingText.getText().toString().trim();
                binding.typingText.setText(a + "1");
            }
        });
        binding.two.setOnClickListener(view -> {
            if (equals == 1) {
                String s = binding.typingText.getText().toString().trim();
                if (s.contains("/") || s.contains("*") || s.contains("-") || s.contains("+")) {
                    String a = binding.typingText.getText().toString().trim();
                    binding.typingText.setText(a + "2");
                } else {
                    binding.typingText.setText("");
                    binding.typingText.setText("2");
                    equals = 0;
                }
            } else {
                String a = binding.typingText.getText().toString().trim();
                binding.typingText.setText(a + "2");
            }
        });
        binding.three.setOnClickListener(view -> {
            if (equals == 1) {
                String s = binding.typingText.getText().toString().trim();
                if (s.contains("/") || s.contains("*") || s.contains("-") || s.contains("+")) {
                    String a = binding.typingText.getText().toString().trim();
                    binding.typingText.setText(a + "3");
                } else {
                    binding.typingText.setText("");
                    binding.typingText.setText("3");
                    equals = 0;
                }
            } else {
                String a = binding.typingText.getText().toString().trim();
                binding.typingText.setText(a + "3");
            }
        });
        binding.plus.setOnClickListener(view -> {
            String trim = binding.typingText.getText().toString().trim();
            if (!trim.equals("")) {
                if (!trim.contains("+")) {
                    if (isNumeric(trim) && !trim.endsWith(".")) {
                        amal = 5;
                        binding.typingText.setText(trim + "+");
                    }
                }
            }
        });
        binding.zero.setOnClickListener(view -> {
            if (equals == 1) {
                String s = binding.typingText.getText().toString().trim();
                if (s.contains("/") || s.contains("*") || s.contains("-") || s.contains("+")) {
                    String a = binding.typingText.getText().toString().trim();
                    binding.typingText.setText(a + "0");
                } else {
                    binding.typingText.setText("");
                    binding.typingText.setText("0");
                    equals = 0;
                }
            } else {
                String a = binding.typingText.getText().toString().trim();
                if (!a.equals("")) {
                    if (!a.contains(".")) {
                        String substring = a.substring(0, 1);
                        if (!substring.equals("0")) {
                            binding.typingText.setText(a + "0");
                        }
                    } else {
                        binding.typingText.setText(a + "0");
                    }
                } else {
                    binding.typingText.setText(a + "0");
                }
            }
        });
        binding.comma.setOnClickListener(view -> {
            String a = binding.typingText.getText().toString().trim();
            if (!a.isEmpty()) {
                String s = a.substring(a.length() - 1);
                if (!a.contains(".") && !s.equals("/") && !s.equals("*") && !s.equals("-") && !s.equals("+")) {
                    binding.typingText.setText(a + ".");
                } else if (a.contains(".") && (!s.equals("/") && !s.equals("*") && !s.equals("-") && !s.equals("+")) && !s.equals(".") && (a.contains("/") || a.contains("*") || a.contains("-") || a.contains("+"))) {
                    if (a.contains("/")) {
                        int i = a.indexOf("/");
                        String substring = a.substring(i + 1);
                        if (!substring.contains(".")) {
                            binding.typingText.setText(a + ".");
                        }
                    } else if (a.contains("*")) {
                        int i = a.indexOf("*");
                        String substring = a.substring(i + 1);
                        if (!substring.contains(".")) {
                            binding.typingText.setText(a + ".");
                        }
                    } else if (a.contains("-")) {
                        int i = a.indexOf("-");
                        String substring = a.substring(i + 1);
                        if (!substring.contains(".")) {
                            binding.typingText.setText(a + ".");
                        }
                    } else if (a.contains("+")) {
                        int i = a.indexOf("+");
                        String substring = a.substring(i + 1);
                        if (!substring.contains(".")) {
                            binding.typingText.setText(a + ".");
                        }
                    }
                }
            }
        });
        //1 %  =====//2 / ==== //3 * =====  //4 - ======== //5 +
        binding.equals.setOnClickListener(view -> {
            String trim = binding.typingText.getText().toString().trim();
            if (!trim.isEmpty()) {
                String substring = trim.substring(trim.length() - 1);
                if (!substring.equals("/") && !substring.equals("*") && !substring.equals("-") && !substring.equals("+") && (trim.contains("/") || trim.contains("*") || trim.contains("-") || trim.contains("+"))) {
                    switch (amal) {
                        case 1:
                            equals = 1;
                            double v = Double.parseDouble(trim);
                            if (String.valueOf(v).length() <= 10) {
                                binding.typingText.setText(String.valueOf(v / 100));
                            } else {
                                binding.typingText.setText(String.valueOf(v / 100).substring(0, 10));
                            }
                            break;
                        case 2:
                            equals = 1;
                            int i = trim.indexOf("/");
                            String number1 = trim.substring(0, i);
                            String number2 = trim.substring(i + 1);
                            String s = String.valueOf(Double.parseDouble(number1) / Double.parseDouble(number2));
                            if (s.length() <= 10) {
                                binding.typingText.setText(s);
                            } else {
                                binding.typingText.setText(s.substring(0, 10));
                            }
                            break;
                        case 3:
                            equals = 1;
                            int j = trim.indexOf("*");
                            String number3 = trim.substring(0, j);
                            String number4 = trim.substring(j + 1);
                            String s1 = String.valueOf(Double.parseDouble(number3) * Double.parseDouble(number4));
                            binding.typingText.setText(s1);
                            break;
                        case 4:
                            equals = 1;
                            int w = trim.lastIndexOf("-");
                            String number5 = trim.substring(0, w);
                            String number6 = trim.substring(w + 1);
                            String s2 = String.valueOf(Double.parseDouble(number5) - Double.parseDouble(number6));
                            binding.typingText.setText(s2);
                            break;
                        case 5:
                            equals = 1;
                            int a = trim.indexOf("+");
                            String number7 = trim.substring(0, a);
                            String number8 = trim.substring(a + 1);
                            String s3 = String.valueOf(Double.parseDouble(number7) + Double.parseDouble(number8));
                            binding.typingText.setText(s3);
                            break;
                        default:
                    }
                }
            }
        });
        binding.eraser.setOnClickListener(view -> {
            String trim = binding.typingText.getText().toString().trim();
            if (trim.length() > 1) {
                binding.typingText.setText(binding.typingText.getText().toString().trim().substring(0, binding.typingText.getText().toString().trim().length() - 1));
            } else if (trim.length() == 1) {
                binding.typingText.setText("");
            }
        });
    }

    private boolean isNumeric(String strNum) {
        if (strNum == null) {
            return false;
        }
        try {
            double d = Double.parseDouble(strNum);
        } catch (NumberFormatException nfe) {
            return false;
        }
        return true;
    }
}