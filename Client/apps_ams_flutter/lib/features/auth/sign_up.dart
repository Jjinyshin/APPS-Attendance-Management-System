import 'package:apps_ams_flutter/const/gaps.dart';
import 'package:apps_ams_flutter/const/sizes.dart';
import 'package:apps_ams_flutter/features/auth/widget/auth_button.dart';
import 'package:flutter/material.dart';
import 'package:font_awesome_flutter/font_awesome_flutter.dart';

class SignUpScreen extends StatelessWidget {
  const SignUpScreen({super.key});

  @override
  Widget build(BuildContext context) {
    return const Scaffold(
      body: SafeArea(
        child: Padding(
          padding: EdgeInsets.symmetric(horizontal: Sizes.size40),
          child: Column(
            crossAxisAlignment: CrossAxisAlignment.start,
            children: [
              Gaps.v96,
              Text(
                "앱으로 하는 간편한 출석체크",
                style: TextStyle(
                  fontSize: Sizes.size16,
                  fontWeight: FontWeight.w400,
                ),
              ),
              Gaps.v4,
              Text(
                "AppsCheck",
                style: TextStyle(
                  fontSize: Sizes.size44,
                  fontWeight: FontWeight.w800,
                ),
              ),
              Spacer(),
              AuthButton(
                textColor: Colors.white,
                bgColor: Colors.black,
                icon: FaIcon(
                  FontAwesomeIcons.apple,
                  color: Colors.white,
                ),
                text: "Apple로 계속하기",
              ),
              Gaps.v10,
              AuthButton(
                textColor: Colors.black,
                bgColor: Colors.yellow,
                icon: FaIcon(
                  FontAwesomeIcons.apple,
                  color: Colors.black,
                ),
                text: "카카오톡으로 계속하기",
              ),
              Gaps.v10,
              AuthButton(
                textColor: Colors.white,
                bgColor: Colors.blue,
                icon: FaIcon(
                  FontAwesomeIcons.google,
                  color: Colors.red,
                ),
                text: "Google 계정으로 계속하기",
              ),
              Gaps.v96,
            ],
          ),
        ),
      ),
    );
  }
}
