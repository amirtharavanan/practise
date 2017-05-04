#include<iostream.h>
using namespace std;
struct TreeNode
{
int val;
TreeNode *left,*right;
TreeNode(int v):val(v),left(NULL),right(NULL)
{
}
};
bool mirror_equals(TreeNode *left,TreeNode *right)
{
if(left==NULL || right == NULL)
    return left== NULL && right==NULL;
    return(left->val==right->val mirror_equals(left->left,rigtht->right)&&mirror_equals(left->right,rigtht->left));
  }
  bool is_symmentric(TreeNode *root)
  {
  if(root == NULL)
  return true;
  if(mirror_equals(root->left,root->right))
  return true;
  return false;
  }
  void Test1()
  {
  TreeNode *root=new TreeNode(1);
  root->left=new TreeNode(2);
  root->right=new TreeNode(2);
  root->left->left=new TreeNode(3);
  root->right->right=new TreeNode(3);
  if(is_symmetric(root))
  {
  cout<<"Symmetric"<<endl;
  }
  else
  {
  cout<<"Not Symmetric" <<endl;
  }
  }
  void Test2()
  {
  TreeNode *root=new TreeNode(1);
  root->left=new TreeNode(2);
  root->right=new TreeNode(2);
  root->left->left=new TreeNode(3);
  root->left->right=new TreeNode(3);
  if(is_symmetric(root))
  {
  cout<<"Symmetric"<<endl;
  }
  else
  {
  cout<<"Not Symmetric" <<endl;
  }
  }
  int main()
  {
  Test1();
  Test2();
  return 0;
  }
  
