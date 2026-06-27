package com.mokelab.demo.multimodule.screen

import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import com.mokelab.demo.multimodule.repository.Data141RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data142RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data143RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data144RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data145RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data146RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data147RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data148RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data149RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data150RepositoryImpl 

import javax.inject.Inject

@HiltViewModel
class Screen015ViewModel @Inject constructor(
    private val repo1: Data141RepositoryImpl,
    private val repo2: Data142RepositoryImpl,
    private val repo3: Data143RepositoryImpl,
    private val repo4: Data144RepositoryImpl,
    private val repo5: Data145RepositoryImpl,
    private val repo6: Data146RepositoryImpl,
    private val repo7: Data147RepositoryImpl,
    private val repo8: Data148RepositoryImpl,
    private val repo9: Data149RepositoryImpl,
    private val repo10: Data150RepositoryImpl,

): ViewModel() {
}
